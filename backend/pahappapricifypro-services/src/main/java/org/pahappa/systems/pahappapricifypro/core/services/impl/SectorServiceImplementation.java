package org.pahappa.systems.pahappapricifypro.core.services.impl;

import org.pahappa.systems.pahappapricifypro.core.services.SectorService;
import org.pahappa.systems.pahappapricifypro.models.sector.Sector;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.model.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SectorServiceImplementation extends GenericServiceImpl<Sector> implements SectorService {
    @Override
    public Sector saveInstance(Sector entityInstance) throws ValidationFailedException, OperationFailedException {
        return super.save(entityInstance);
    }

    @Override
    public boolean isDeletable(Sector instance) throws OperationFailedException {
        return true;
    }
}
