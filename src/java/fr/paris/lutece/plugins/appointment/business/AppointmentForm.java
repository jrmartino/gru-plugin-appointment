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

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * This is the business class for the object AppointmentForm
 */
public class AppointmentForm
{
    /**
     * Name of the resource type of Appointment Forms
     */
    public static final String RESOURCE_TYPE = "APPOINTMENT_FORM";

    // Variables declarations 

    private int _nIdForm;
    @NotEmpty( message = "#i18n{appointment.validation.appointmentform.Title.notEmpty}" )
    @Size( max = 255, message = "#i18n{appointment.validation.appointmentform.Title.size}" )
    private String _strTitle;
    @NotNull( message = "#i18n{portal.validation.message.notEmpty}" )
    @Pattern( regexp = "[0-2][0-9]:[0-6][0-9]", message = "#i18n{appointment.modify_appointmentForm.patternTimeStart}" )
    private String _strTimeStart;
    @Pattern( regexp = "[0-2][0-9]:[0-6][0-9]", message = "#i18n{appointment.modify_appointmentForm.patternTimeEnd}" )
    @NotNull( message = "#i18n{portal.validation.message.notEmpty}" )
    private String _strTimeEnd;
    @NotNull( message = "#i18n{portal.validation.message.notEmpty}" )
    @Min( value = 1, message = "#i18n{portal.validation.message.notEmpty}" )
    private int _nDurationAppointments;
    private boolean _bIsOpenMonday;
    private boolean _bIsOpenTuesday;
    private boolean _bIsOpenWednesday;
    private boolean _bIsOpenThursday;
    private boolean _bIsOpenFriday;
    private boolean _bIsOpenSaturday;
    private boolean _bIsOpenSunday;
    private Date _dateDateStartValidity;
    private Date _dateDateEndValidity;
    private boolean _bIsActive;
    private boolean _bDisplayTitleFo;
    @Min( value = 1, message = "#i18n{portal.validation.message.notEmpty}" )
    private int _nNbWeeksToDisplay;
    @Min( value = 1, message = "#i18n{portal.validation.message.notEmpty}" )
    private int _nPeoplePerAppointment;
    private int _nIdWorkflow;

    /**
     * Returns the IdForm
     * @return The IdForm
     */
    public int getIdForm( )
    {
        return _nIdForm;
    }

    /**
     * Sets the IdForm
     * @param nIdForm The IdForm
     */
    public void setIdForm( int nIdForm )
    {
        _nIdForm = nIdForm;
    }

    /**
     * Returns the Title
     * @return The Title
     */
    public String getTitle( )
    {
        return _strTitle;
    }

    /**
     * Sets the Title
     * @param strTitle The Title
     */
    public void setTitle( String strTitle )
    {
        _strTitle = strTitle;
    }

    /**
     * Returns the TimeStart
     * @return The TimeStart
     */
    public String getTimeStart( )
    {
        return _strTimeStart;
    }

    /**
     * Sets the TimeStart
     * @param nTimeStart The TimeStart
     */
    public void setTimeStart( String nTimeStart )
    {
        _strTimeStart = nTimeStart;
    }

    /**
     * Returns the TimeEnd
     * @return The TimeEnd
     */
    public String getTimeEnd( )
    {
        return _strTimeEnd;
    }

    /**
     * Sets the TimeEnd
     * @param nTimeEnd The TimeEnd
     */
    public void setTimeEnd( String nTimeEnd )
    {
        _strTimeEnd = nTimeEnd;
    }

    /**
     * Returns the DurationAppointments
     * @return The DurationAppointments
     */
    public int getDurationAppointments( )
    {
        return _nDurationAppointments;
    }

    /**
     * Sets the DurationAppointments
     * @param nDurationAppointments The DurationAppointments
     */
    public void setDurationAppointments( int nDurationAppointments )
    {
        _nDurationAppointments = nDurationAppointments;
    }

    /**
     * Returns the IsOpenMonday
     * @return The IsOpenMonday
     */
    public boolean getIsOpenMonday( )
    {
        return _bIsOpenMonday;
    }

    /**
     * Sets the IsOpenMonday
     * @param bIsOpenMonday The IsOpenMonday
     */
    public void setIsOpenMonday( boolean bIsOpenMonday )
    {
        _bIsOpenMonday = bIsOpenMonday;
    }

    /**
     * Returns the IsOpenTuesday
     * @return The IsOpenTuesday
     */
    public boolean getIsOpenTuesday( )
    {
        return _bIsOpenTuesday;
    }

    /**
     * Sets the IsOpenTuesday
     * @param bIsOpenTuesday The IsOpenTuesday
     */
    public void setIsOpenTuesday( boolean bIsOpenTuesday )
    {
        _bIsOpenTuesday = bIsOpenTuesday;
    }

    /**
     * Returns the IsOpenWednesday
     * @return The IsOpenWednesday
     */
    public boolean getIsOpenWednesday( )
    {
        return _bIsOpenWednesday;
    }

    /**
     * Sets the IsOpenWednesday
     * @param bIsOpenWednesday The IsOpenWednesday
     */
    public void setIsOpenWednesday( boolean bIsOpenWednesday )
    {
        _bIsOpenWednesday = bIsOpenWednesday;
    }

    /**
     * Returns the IsOpenThursday
     * @return The IsOpenThursday
     */
    public boolean getIsOpenThursday( )
    {
        return _bIsOpenThursday;
    }

    /**
     * Sets the IsOpenThursday
     * @param bIsOpenThursday The IsOpenThursday
     */
    public void setIsOpenThursday( boolean bIsOpenThursday )
    {
        _bIsOpenThursday = bIsOpenThursday;
    }

    /**
     * Returns the IsOpenFriday
     * @return The IsOpenFriday
     */
    public boolean getIsOpenFriday( )
    {
        return _bIsOpenFriday;
    }

    /**
     * Sets the IsOpenFriday
     * @param bIsOpenFriday The IsOpenFriday
     */
    public void setIsOpenFriday( boolean bIsOpenFriday )
    {
        _bIsOpenFriday = bIsOpenFriday;
    }

    /**
     * Returns the IsOpenSaturday
     * @return The IsOpenSaturday
     */
    public boolean getIsOpenSaturday( )
    {
        return _bIsOpenSaturday;
    }

    /**
     * Sets the IsOpenSaturday
     * @param bIsOpenSaturday The IsOpenSaturday
     */
    public void setIsOpenSaturday( boolean bIsOpenSaturday )
    {
        _bIsOpenSaturday = bIsOpenSaturday;
    }

    /**
     * Returns the IsOpenSunday
     * @return The IsOpenSunday
     */
    public boolean getIsOpenSunday( )
    {
        return _bIsOpenSunday;
    }

    /**
     * Sets the IsOpenSunday
     * @param bIsOpenSunday The IsOpenSunday
     */
    public void setIsOpenSunday( boolean bIsOpenSunday )
    {
        _bIsOpenSunday = bIsOpenSunday;
    }

    /**
     * Returns the DateStartValidity
     * @return The DateStartValidity
     */
    public Date getDateStartValidity( )
    {
        return _dateDateStartValidity;
    }

    /**
     * Sets the DateStartValidity
     * @param dateDateStartValidity The DateStartValidity
     */
    public void setDateStartValidity( Date dateDateStartValidity )
    {
        _dateDateStartValidity = dateDateStartValidity;
    }

    /**
     * Returns the DateEndValidity
     * @return The DateEndValidity
     */
    public Date getDateEndValidity( )
    {
        return _dateDateEndValidity;
    }

    /**
     * Sets the DateEndValidity
     * @param dateDateEndValidity The DateEndValidity
     */
    public void setDateEndValidity( Date dateDateEndValidity )
    {
        _dateDateEndValidity = dateDateEndValidity;
    }

    /**
     * Returns the IsActive
     * @return The IsActive
     */
    public boolean getIsActive( )
    {
        return _bIsActive;
    }

    /**
     * Sets the IsActive
     * @param bIsActive The IsActive
     */
    public void setIsActive( boolean bIsActive )
    {
        _bIsActive = bIsActive;
    }

    /**
     * Returns the DisplayTitleFo
     * @return The DisplayTitleFo
     */
    public boolean getDisplayTitleFo( )
    {
        return _bDisplayTitleFo;
    }

    /**
     * Sets the DispolayTitleFo
     * @param bDisplayTitleFo The DisplayTitleFo
     */
    public void setDisplayTitleFo( boolean bDisplayTitleFo )
    {
        _bDisplayTitleFo = bDisplayTitleFo;
    }

    /**
     * Returns the NbWeeksToDisplay
     * @return The NbWeeksToDisplay
     */
    public int getNbWeeksToDisplay( )
    {
        return _nNbWeeksToDisplay;
    }

    /**
     * Sets the NbWeeksToDisplay
     * @param nNbWeeksToDisplay The NbWeeksToDisplay
     */
    public void setNbWeeksToDisplay( int nNbWeeksToDisplay )
    {
        _nNbWeeksToDisplay = nNbWeeksToDisplay;
    }

    /**
     * Returns the PeoplePerAppointment
     * @return The PeoplePerAppointment
     */
    public int getPeoplePerAppointment( )
    {
        return _nPeoplePerAppointment;
    }

    /**
     * Sets the PeoplePerAppointment
     * @param nPeoplePerAppointment The PeoplePerAppointment
     */
    public void setPeoplePerAppointment( int nPeoplePerAppointment )
    {
        _nPeoplePerAppointment = nPeoplePerAppointment;
    }

    /**
     * Get the id of the workflow associated with this appointment form
     * @return The id of the workflow
     */
    public int getIdWorkflow( )
    {
        return _nIdWorkflow;
    }

    /**
     * Set the id of the workflow associated with this appointment form
     * @param nIdWorkflow The id of the workflow
     */
    public void setIdWorkflow( int nIdWorkflow )
    {
        _nIdWorkflow = nIdWorkflow;
    }
}