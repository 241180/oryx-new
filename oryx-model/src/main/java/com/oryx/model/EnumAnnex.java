package com.oryx.model;

import com.oryx.domain.IEnumCrudOperation;
import com.oryx.domain.IEnumRole;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by smbarki on 22/03/2018.
 */
@XmlType(name = "XmlEnumAnnex", namespace = "http://model.ref.ws.oryx.com")
public class EnumAnnex {
    private IEnumRole.Types role;
    private IEnumCrudOperation.Types operation;
}
