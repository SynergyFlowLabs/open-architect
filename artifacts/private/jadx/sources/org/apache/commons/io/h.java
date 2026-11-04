package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f336555b = new h("Normal");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f336556c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f336557a;

    static class a extends h {
        a() {
            super("Force");
        }

        @Override // org.apache.commons.io.h
        protected boolean c(File file) throws IOException {
            k.G(file);
            return true;
        }
    }

    protected h(String str) {
        this.f336557a = str;
    }

    public void a(File file) throws IOException {
        if (!file.exists() || c(file)) {
            return;
        }
        throw new IOException("Deletion failed: " + file);
    }

    public boolean b(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        try {
            return c(file);
        } catch (IOException unused) {
            return false;
        }
    }

    protected boolean c(File file) throws IOException {
        return file.delete();
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.f336557a + "]";
    }
}
