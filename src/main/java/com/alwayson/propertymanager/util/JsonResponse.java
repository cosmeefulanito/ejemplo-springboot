package com.alwayson.propertymanager.util;

import java.util.List;

public class JsonResponse <T> {

    List<T> data = null;
    T dataDos = null;
    boolean error = false;
    String mensaje = "";

    public JsonResponse() {
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getDataDos() {
        return dataDos;
    }

    public void setDataDos(T dataDos) {
        this.dataDos = dataDos;
    }


}
