<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div id="addContactsModal"
     class="modal hide fade in centering insertAndUpdateDialogs"
     role="dialog"
     aria-labelledby="addContactsModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="addContactsModalLabel" class="displayInLine">
            <spring:message code="create"/>&nbsp;<spring:message code="contact"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="newContactForm" novalidate >
            <div class="pull-left">
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="contacts.contactType"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               autofocus
                               ng-model="contact.contactType"
                               name="name"
                               placeholder="<spring:message code='contact'/>&nbsp;<spring:message code='contacts.contactType'/>"/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && newContactForm.contactType.$error.required">
                                        <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="contacts.value"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               ng-model="contact.value"
                               name="email"
                               placeholder="<spring:message code='sample.value'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && newContactForm.value.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <input type="submit"
                       class="btn btn-inverse"
                       ng-click="createContact(newContactForm);"
                       value='<spring:message code="create"/>'/>
                <button class="btn btn-inverse"
                        data-dismiss="modal"
                        ng-click="exit('#addContactsModal');"
                        aria-hidden="true">
                    <spring:message code="cancel"/>
                </button>
            </div>
        </form>
    </div>
    <span class="alert alert-error dialogErrorMessage"
          ng-show="errorOnSubmit">
        <spring:message code="request.error"/>
    </span>
</div>

<div id="updateContactsModal"
     class="modal hide fade in centering insertAndUpdateDialogs"
     role="dialog"
     aria-labelledby="updateContactsModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="updateContactsModalLabel" class="displayInLine">
            <spring:message code="update"/>&nbsp;<spring:message code="contact"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="updateContactForm" novalidate>
            <input type="hidden"
                   required
                   ng-model="contact.id"
                   name="id"
                   value="{{contact.id}}"/>

            <div class="pull-left">
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="contacts.contactType"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               autofocus
                               required
                               ng-model="contact.contactType"
                               name="name"
                               placeholder="<spring:message code='contact'/>&nbsp;<spring:message code='contacts.contactType'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && updateContactForm.contactType.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="contacts.value"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               ng-model="contact.value"
                               name="email"
                               placeholder="<spring:message code='sample.value'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && updateContactForm.value.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <input type="submit"
                       class="btn btn-inverse"
                       ng-click="updateContact(updateContactForm);"
                       value='<spring:message code="update"/>'/>
                <button class="btn btn-inverse"
                        data-dismiss="modal"
                        ng-click="exit('#updateContactsModal');"
                        aria-hidden="true">
                    <spring:message code="cancel"/></button>
            </div>
        </form>
    </div>
    <span class="alert alert-error dialogErrorMessage"
          ng-show="errorOnSubmit">
        <spring:message code="request.error"/>
    </span>
</div>

<div id="deleteContactsModal"
     class="modal hide fade in centering"
     role="dialog"
     aria-labelledby="searchContactsModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="deleteContactsModalLabel" class="displayInLine">
            <spring:message code="delete"/>&nbsp;<spring:message code="contact"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="deleteContactForm" novalidate>
            <p><spring:message code="delete.confirm"/>:&nbsp;{{contact.contactType}}?</p>

            <input type="submit"
                   class="btn btn-inverse"
                   ng-click="deleteContact();"
                   value='<spring:message code="delete"/>'/>
            <button class="btn btn-inverse"
                    data-dismiss="modal"
                    ng-click="exit('#deleteContactsModal');"
                    aria-hidden="true">
                <spring:message code="cancel"/>
            </button>
        </form>
    </div>
    <span class="alert alert-error dialogErrorMessage"
          ng-show="errorOnSubmit">
        <spring:message code="request.error"/>
    </span>
    <span class="alert alert-error dialogErrorMessage"
          ng-show="errorIllegalAccess">
        <spring:message code="request.illegal.access"/>
    </span>
</div>

<div id="searchContactsModal"
     class="modal hide fade in centering"
     role="dialog"
     aria-labelledby="searchContactsModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="searchContactsModalLabel" class="displayInLine">
            <spring:message code="search"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="searchContactForm" novalidate>
            <label><spring:message code="search.for"/></label>

            <div>
                <div class="input-append">
                    <input type="text"
                           autofocus
                           required
                           ng-model="searchFor"
                           name="searchFor"
                           placeholder="<spring:message code='contact'/>&nbsp;<spring:message code='contacts.contactType'/> "/>
                </div>
                <div class="input-append displayInLine">
                    <label class="displayInLine">
                        <span class="alert alert-error"
                              ng-show="displayValidationError && searchContactForm.searchFor.$error.required">
                            <spring:message code="required"/>
                        </span>
                    </label>
                </div>
            </div>
            <input type="submit"
                   class="btn btn-inverse"
                   ng-click="searchContact(searchContactForm, false);"
                   value='<spring:message code="search"/>'
                    />
            <button class="btn btn-inverse"
                    data-dismiss="modal"
                    ng-click="exit('#searchContactsModal');"
                    aria-hidden="true">
                <spring:message code="cancel"/>
            </button>
        </form>
    </div>
    <span class="alert alert-error dialogErrorMessage"
          ng-show="errorOnSubmit">
        <spring:message code="request.error"/>
    </span>
</div>
