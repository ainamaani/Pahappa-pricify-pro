package org.pahappa.systems.pahappapricifypro.views;

import com.googlecode.genericdao.search.Search;
import lombok.Getter;
import lombok.Setter;
import org.pahappa.systems.pahappapricifypro.core.services.QuotationService;
import org.pahappa.systems.pahappapricifypro.models.quotation.Quotation;
import org.pahappa.systems.pahappapricifypro.security.UiUtils;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.SortMeta;
import org.sers.webutils.client.views.presenters.PaginatedTableView;
import org.sers.webutils.server.core.service.excel.reports.ExcelReport;
import org.sers.webutils.server.core.utils.ApplicationContextProvider;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.util.List;
import java.util.Map;

@Getter
@Setter

@ManagedBean(name = "quotationView")
public class QuotationView extends PaginatedTableView<Quotation, QuotationService,QuotationService> {
    private QuotationService quotationService;
    private Search search;

    @PostConstruct
    public void init(){
        quotationService = ApplicationContextProvider.getBean(QuotationService.class);
        reloadFilterReset();
    }
    @Override
    public void reloadFromDB(int i, int i1, Map<String, Object> map) throws Exception {
        super.setDataModels(quotationService.getInstances(new Search(),i,i1));
    }

    @Override
    public void reloadFilterReset(){
        super.setTotalRecords(quotationService.countInstances(new Search()));
        try{
            super.reloadFilterReset();
        }catch(Exception e){
            UiUtils.ComposeFailure("Error",e.getLocalizedMessage());
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
    public List<Quotation> load(int i, int i1, Map<String, SortMeta> map, Map<String, FilterMeta> map1) {
        return null;
    }
}
