package com.devtodev.core.utils.ue4;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class StringMapContainer {
    private HashMap<String, String> resources = new HashMap<>();

    public HashMap<String, String> getResources() {
        return this.resources;
    }

    public void put(String str, String str2) {
        this.resources.put(str, str2);
    }
}
