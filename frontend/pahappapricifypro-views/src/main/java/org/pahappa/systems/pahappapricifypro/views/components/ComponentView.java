package org.pahappa.systems.pahappapricifypro.views.components;

import com.googlecode.genericdao.search.Search;
import lombok.Getter;
import lombok.Setter;
import org.pahappa.systems.pahappapricifypro.core.services.ComponentService;
import org.pahappa.systems.pahappapricifypro.core.services.SectorService;
import org.pahappa.systems.pahappapricifypro.models.component.Component;
import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.pahappa.systems.pahappapricifypro.security.UiUtils;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.SortMeta;
import org.sers.webutils.client.views.presenters.PaginatedTableView;
import org.sers.webutils.model.RecordStatus;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.server.core.service.excel.reports.ExcelReport;
import org.sers.webutils.server.core.utils.ApplicationContextProvider;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import java.util.Map;


@Getter
@Setter
@SessionScoped
@ManagedBean(name = "componentBean")
public class ComponentView extends PaginatedTableView<Component,ComponentView, ComponentView> {
    private ComponentService componentService;
    private Search search;
    @PostConstruct
    public void init(){
        componentService = ApplicationContextProvider.getBean(ComponentService.class);
        this.reloadFilterReset();
    }
    @Override
    public void reloadFromDB(int i, int i1, Map<String, Object> map) throws Exception {
        super.setDataModels(componentService.getInstances(new Search().addFilterEqual("recordStatus", RecordStatus.ACTIVE),i,i1));
    }

    @Override
    public void reloadFilterReset(){
        super.setTotalRecords(componentService.countInstances(new Search()));
        try {
            super.reloadFilterReset();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ExcelReport> getExcelReportModels() {
        return null;
    }

    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public List<Component> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
        return getDataModels();
    }

    public void deleteComponent(Component component){
        try{
            componentService.deleteInstance(component);
        }catch (OperationFailedException e){
            UiUtils.ComposeFailure("Operation failed", e.getLocalizedMessage());
        }
    }



}
