/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2017 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://oss.oracle.com/licenses/CDDL+GPL-1.1
 * or LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.08.29 at 09:53:40 AM CEST 
//

package com.example.largexml;

import java.util.Date;

public class Post {

    protected int id;
    protected int postTypeId;
    protected int acceptedAnswerId;
    protected Date creationDate;
    protected int score;
    protected int viewCount;
    protected String body;
    protected int ownerUserId;
    protected int lastEditorUserId;
    protected Date lastEditDate;
    protected Date lastActivityDate;
    protected String title;
    protected String tags;
    protected int answerCount;
    protected int commentCount;

    public int getId() {
        return id;
    }

    public int getPostTypeId() {
        return postTypeId;
    }

    public int getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getScore() {
        return score;
    }

    public int getViewCount() {
        return viewCount;
    }

    public String getBody() {
        return body;
    }

    public int getOwnerUserId() {
        return ownerUserId;
    }

    public int getLastEditorUserId() {
        return lastEditorUserId;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public String getTitle() {
        return title;
    }

    public String getTags() {
        return tags;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPostTypeId(int postTypeId) {
        this.postTypeId = postTypeId;
    }

    public void setAcceptedAnswerId(int acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public void setCreationDate(Date value) {
        this.creationDate = value;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setOwnerUserId(int ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public void setLastEditorUserId(int lastEditorUserId) {
        this.lastEditorUserId = lastEditorUserId;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
