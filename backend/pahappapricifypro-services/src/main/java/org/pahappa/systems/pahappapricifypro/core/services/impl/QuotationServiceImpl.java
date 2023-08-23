package org.pahappa.systems.pahappapricifypro.core.services.impl;

import org.pahappa.systems.pahappapricifypro.core.services.QuotationService;
import org.pahappa.systems.pahappapricifypro.models.quotation.Quotation;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.model.exception.ValidationFailedException;

public class QuotationServiceImpl extends GenericServiceImpl<Quotation> implements QuotationService {
    @Override
    public Quotation saveInstance(Quotation entityInstance) throws ValidationFailedException, OperationFailedException {
        return null;
    }

    @Override
    public boolean isDeletable(Quotation instance) throws OperationFailedException {
        return false;
    }
}
