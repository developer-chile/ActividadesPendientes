package Clases;

import android.text.Editable;
import android.util.EventLogTags;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by developer-chile on 13-12-2015.
 */
public class Actividad {
    private long ActividadId;
    private String Descripcion;
    private int Estado;
    private Date FechaInicio;
    private Date FechaFin;

    public Actividad(){};

    public Actividad(long actividadId, String descripcion, int estado, Date fechaInicio, Date fechaFin) {
        ActividadId = actividadId;
        Descripcion = descripcion;
        Estado = 1;
        FechaInicio = fechaInicio;
        FechaFin = null;
    }

    public Actividad(String descripcion) {
        ActividadId = 1;
        Descripcion = descripcion;
        Estado = 1;
        FechaInicio = new Date();
        FechaFin = null;
    }

    public long getActividadId() {
        return ActividadId;
    }

    public void setActividadId(long actividadId) {
        ActividadId = actividadId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        FechaFin = fechaFin;
    }
}