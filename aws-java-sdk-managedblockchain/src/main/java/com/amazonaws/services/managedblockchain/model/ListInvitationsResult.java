/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListInvitations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvitationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The invitations for the network.
     * </p>
     */
    private java.util.List<Invitation> invitations;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The invitations for the network.
     * </p>
     * 
     * @return The invitations for the network.
     */

    public java.util.List<Invitation> getInvitations() {
        return invitations;
    }

    /**
     * <p>
     * The invitations for the network.
     * </p>
     * 
     * @param invitations
     *        The invitations for the network.
     */

    public void setInvitations(java.util.Collection<Invitation> invitations) {
        if (invitations == null) {
            this.invitations = null;
            return;
        }

        this.invitations = new java.util.ArrayList<Invitation>(invitations);
    }

    /**
     * <p>
     * The invitations for the network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvitations(java.util.Collection)} or {@link #withInvitations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param invitations
     *        The invitations for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withInvitations(Invitation... invitations) {
        if (this.invitations == null) {
            setInvitations(new java.util.ArrayList<Invitation>(invitations.length));
        }
        for (Invitation ele : invitations) {
            this.invitations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The invitations for the network.
     * </p>
     * 
     * @param invitations
     *        The invitations for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withInvitations(java.util.Collection<Invitation> invitations) {
        setInvitations(invitations);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInvitations() != null)
            sb.append("Invitations: ").append(getInvitations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvitationsResult == false)
            return false;
        ListInvitationsResult other = (ListInvitationsResult) obj;
        if (other.getInvitations() == null ^ this.getInvitations() == null)
            return false;
        if (other.getInvitations() != null && other.getInvitations().equals(this.getInvitations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitations() == null) ? 0 : getInvitations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInvitationsResult clone() {
        try {
            return (ListInvitationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
