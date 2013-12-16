/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.appointment.business;

import java.sql.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * This is the business class for the object Appointment
 */
public class Appointment
{

    private static final int STATUS_REJECTED = -10;
    private static final int STATUS_NOT_VALIDATED = 0;
    private static final int STATUS_VALIDATED = 10;

    private int _nIdAppointment;
    // @NotEmpty( message = "#i18n{appointment.validation.appointment.FirstName.notEmpty}" )
    @NotEmpty( message = "#i18n{portal.validation.message.notEmpty}" )
    // @Size( max = 255 , message = "#i18n{appointment.validation.appointment.FirstName.size}" ) 
    @Size( max = 255, message = "#i18n{portal.validation.message.sizeMax}" )
    private String _strFirstName;
    // @NotEmpty( message = "#i18n{appointment.validation.appointment.LastName.notEmpty}" )
    @NotEmpty( message = "#i18n{portal.validation.message.notEmpty}" )
    // @Size( max = 255 , message = "#i18n{appointment.validation.appointment.LastName.size}" ) 
    @Size( max = 255, message = "#i18n{portal.validation.message.sizeMax}" )
    private String _strLastName;
    // @NotEmpty( message = "#i18n{appointment.validation.appointment.Email.notEmpty}" )
    @NotEmpty( message = "#i18n{portal.validation.message.notEmpty}" )
    // @Size( max = 255 , message = "#i18n{appointment.validation.appointment.Email.size}" ) 
    @Size( max = 255, message = "#i18n{portal.validation.message.sizeMax}" )
    @Email( message = "#i18n{portal.validation.message.email}" )
    private String _strEmail;
    // @Size( max = 255 , message = "#i18n{appointment.validation.appointment.IdUser.size}" ) 
    @Size( max = 255, message = "#i18n{portal.validation.message.sizeMax}" )
    private String _strIdUser;
    private String _strTimeAppointment;
    private Date _dateDateAppointment;
    private int _nStatus;

    /**
     * Returns the IdAppointment
     * @return The IdAppointment
     */
    public int getIdAppointment( )
    {
        return _nIdAppointment;
    }

    /**
     * Sets the IdAppointment
     * @param nIdAppointment The IdAppointment
     */
    public void setIdAppointment( int nIdAppointment )
    {
        _nIdAppointment = nIdAppointment;
    }

    /**
     * Returns the FirstName
     * @return The FirstName
     */
    public String getFirstName( )
    {
        return _strFirstName;
    }

    /**
     * Sets the FirstName
     * @param strFirstName The FirstName
     */
    public void setFirstName( String strFirstName )
    {
        _strFirstName = strFirstName;
    }

    /**
     * Returns the LastName
     * @return The LastName
     */
    public String getLastName( )
    {
        return _strLastName;
    }

    /**
     * Sets the LastName
     * @param strLastName The LastName
     */
    public void setLastName( String strLastName )
    {
        _strLastName = strLastName;
    }

    /**
     * Returns the Email
     * @return The Email
     */
    public String getEmail( )
    {
        return _strEmail;
    }

    /**
     * Sets the Email
     * @param strEmail The Email
     */
    public void setEmail( String strEmail )
    {
        _strEmail = strEmail;
    }

    /**
     * Returns the IdUser
     * @return The IdUser
     */
    public String getIdUser( )
    {
        return _strIdUser;
    }

    /**
     * Sets the IdUser
     * @param strIdUser The IdUser
     */
    public void setIdUser( String strIdUser )
    {
        _strIdUser = strIdUser;
    }

    /**
     * Returns the TimeAppointment
     * @return The TimeAppointment
     */
    public String getTimeAppointment( )
    {
        return _strTimeAppointment;
    }

    /**
     * Sets the TimeAppointment
     * @param nTimeAppointment The TimeAppointment
     */
    public void setTimeAppointment( String nTimeAppointment )
    {
        _strTimeAppointment = nTimeAppointment;
    }

    /**
     * Returns the DateAppointment
     * @return The DateAppointment
     */
    public Date getDateAppointment( )
    {
        return _dateDateAppointment;
    }

    /**
     * Sets the DateAppointment
     * @param dateDateAppointment The DateAppointment
     */
    public void setDateAppointment( Date dateDateAppointment )
    {
        _dateDateAppointment = dateDateAppointment;
    }

    /**
     * Get the status of the appointment
     * @return The status of the appointment
     */
    public int getStatus( )
    {
        return _nStatus;
    }

    /**
     * Set the status of the appointment
     * @param nStatus The status of the appointment
     */
    public void setStatus( int nStatus )
    {
        this.setStatus( nStatus );
    }
}