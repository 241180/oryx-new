package com.oryx.model.tmp;


import com.oryx.model.basic.ITracableCancelableEntity;

/**
 * Created by 241180 on 09/01/2017.
 */

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "XmlModel", namespace = "http://model.element.webservice.remote.oryx.com")
//AFTER TWO COMPILE : uncomment the line bellow
//@GenTypeByTokenProvider(extendType = "com.oryx.core.provider.TypeByTokenProvider")
//@GenServiceDelegate
//@GenDataRepository(extendType = "org.springframework.data.repository.PagingAndSortingRepository")
//@GenEntityEnumeration
//@Entity
//@Table(
//        name = SchemaColumnConstantName.T_MODEL
//        //// ,uniqueConstraints = {@UniqueConstraint(name = "UC_CODE", columnNames = {"id", "personName"})}
//)
public class Model extends ITracableCancelableEntity {

    @Override
    public Object newInstance() {
        return new Model();
    }

    @Override   //AFTER TWO COMPILE : remove Model and use XmlModel
    public Object newXmlInstance() {
        return new Model(); //XmlModel()
    }
}