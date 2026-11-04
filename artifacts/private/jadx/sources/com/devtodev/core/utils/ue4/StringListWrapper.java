package com.devtodev.core.utils.ue4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StringListWrapper {
    private List<String> list = new ArrayList();

    private void add(String str) {
        this.list.add(str);
    }

    private List<String> getList() {
        return this.list;
    }
}
