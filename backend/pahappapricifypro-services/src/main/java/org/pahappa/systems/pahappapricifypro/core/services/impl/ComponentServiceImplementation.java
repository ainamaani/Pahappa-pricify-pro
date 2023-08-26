package org.pahappa.systems.pahappapricifypro.core.services.impl;

import org.pahappa.systems.pahappapricifypro.core.services.ComponentService;
import org.pahappa.systems.pahappapricifypro.models.component.Component;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.model.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ComponentServiceImplementation extends GenericServiceImpl<Component> implements ComponentService {
    @Override
    public Component saveInstance(Component entityInstance) throws ValidationFailedException, OperationFailedException {
        return super.save(entityInstance);
    }

    @Override
    public boolean isDeletable(Component instance) throws OperationFailedException {
        return false;
    }
}
