package com.devtodev.core.utils.ue4;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ResourcesMapContainer {
    private HashMap<String, Number> resources = new HashMap<>();

    public HashMap<String, Number> getResources() {
        return this.resources;
    }

    public void put(String str, float f10) {
        this.resources.put(str, Float.valueOf(f10));
    }

    public void put(String str, int i10) {
        this.resources.put(str, Integer.valueOf(i10));
    }
}
