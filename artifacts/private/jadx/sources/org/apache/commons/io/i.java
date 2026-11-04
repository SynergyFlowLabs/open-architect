package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class i extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f336558a = 1;

    public i() {
    }

    public i(String str) {
        super(str);
    }

    public i(File file) {
        super("File " + file + " exists");
    }
}
