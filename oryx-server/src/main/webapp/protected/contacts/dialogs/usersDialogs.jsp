<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div id="addUsersModal"
     class="modal hide fade in centering insertAndUpdateDialogs"
     role="dialog"
     aria-labelledby="addUsersModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="addUsersModalLabel" class="displayInLine">
            <spring:message code="create"/>&nbsp;<spring:message code="user"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="newUserForm" novalidate >
            <div class="pull-left">
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="users.userCode"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               autofocus
                               ng-model="user.userCode"
                               name="name"
                               placeholder="<spring:message code='user'/>&nbsp;<spring:message code='users.userCode'/>"/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && newUserForm.userCode.$error.required">
                                        <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="users.value"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               ng-model="user.value"
                               name="email"
                               placeholder="<spring:message code='sample.value'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && newUserForm.value.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <input type="submit"
                       class="btn btn-inverse"
                       ng-click="createUser(newUserForm);"
                       value='<spring:message code="create"/>'/>
                <button class="btn btn-inverse"
                        data-dismiss="modal"
                        ng-click="exit('#addUsersModal');"
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

<div id="updateUsersModal"
     class="modal hide fade in centering insertAndUpdateDialogs"
     role="dialog"
     aria-labelledby="updateUsersModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="updateUsersModalLabel" class="displayInLine">
            <spring:message code="update"/>&nbsp;<spring:message code="user"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="updateUserForm" novalidate>
            <input type="hidden"
                   required
                   ng-model="user.id"
                   name="id"
                   value="{{user.id}}"/>

            <div class="pull-left">
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="users.userCode"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               autofocus
                               required
                               ng-model="user.userCode"
                               name="name"
                               placeholder="<spring:message code='user'/>&nbsp;<spring:message code='users.userCode'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && updateUserForm.userCode.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <div>
                    <div class="input-append">
                        <label>* <spring:message code="users.value"/>:</label>
                    </div>
                    <div class="input-append">
                        <input type="text"
                               required
                               ng-model="user.value"
                               name="email"
                               placeholder="<spring:message code='sample.value'/> "/>
                    </div>
                    <div class="input-append">
                        <label>
                                <span class="alert alert-error"
                                      ng-show="displayValidationError && updateUserForm.value.$error.required">
                                    <spring:message code="required"/>
                                </span>
                        </label>
                    </div>
                </div>
                <input type="submit"
                       class="btn btn-inverse"
                       ng-click="updateUser(updateUserForm);"
                       value='<spring:message code="update"/>'/>
                <button class="btn btn-inverse"
                        data-dismiss="modal"
                        ng-click="exit('#updateUsersModal');"
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

<div id="deleteUsersModal"
     class="modal hide fade in centering"
     role="dialog"
     aria-labelledby="searchUsersModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="deleteUsersModalLabel" class="displayInLine">
            <spring:message code="delete"/>&nbsp;<spring:message code="user"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="deleteUserForm" novalidate>
            <p><spring:message code="delete.confirm"/>:&nbsp;{{user.userCode}}?</p>

            <input type="submit"
                   class="btn btn-inverse"
                   ng-click="deleteUser();"
                   value='<spring:message code="delete"/>'/>
            <button class="btn btn-inverse"
                    data-dismiss="modal"
                    ng-click="exit('#deleteUsersModal');"
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

<div id="searchUsersModal"
     class="modal hide fade in centering"
     role="dialog"
     aria-labelledby="searchUsersModalLabel"
     aria-hidden="true">
    <div class="modal-header">
        <h3 id="searchUsersModalLabel" class="displayInLine">
            <spring:message code="search"/>
        </h3>
    </div>
    <div class="modal-body">
        <form name="searchUserForm" novalidate>
            <label><spring:message code="search.for"/></label>

            <div>
                <div class="input-append">
                    <input type="text"
                           autofocus
                           required
                           ng-model="searchFor"
                           name="searchFor"
                           placeholder="<spring:message code='user'/>&nbsp;<spring:message code='users.userCode'/> "/>
                </div>
                <div class="input-append displayInLine">
                    <label class="displayInLine">
                        <span class="alert alert-error"
                              ng-show="displayValidationError && searchUserForm.searchFor.$error.required">
                            <spring:message code="required"/>
                        </span>
                    </label>
                </div>
            </div>
            <input type="submit"
                   class="btn btn-inverse"
                   ng-click="searchUser(searchUserForm, false);"
                   value='<spring:message code="search"/>'
                    />
            <button class="btn btn-inverse"
                    data-dismiss="modal"
                    ng-click="exit('#searchUsersModal');"
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
