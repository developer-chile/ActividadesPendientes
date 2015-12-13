package Clases;

import android.util.EventLogTags;

import java.util.Date;

/**
 * Created by developer-chile on 13-12-2015.
 */
public class Actividad {
    private long ActividadId;
    private String Descripcion;
    private boolean Estado;
    private Date FechaInicio;
    private Date FechaFin;

    public Actividad(){};

    public Actividad(long actividadId, String descripcion, boolean estado, Date fechaInicio, Date fechaFin) {
        ActividadId = actividadId;
        Descripcion = descripcion;
        Estado = estado;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
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

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
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