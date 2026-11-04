package com.google.firebase.crashlytics.internal.settings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f121839b = "com.crashlytics.settings.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f121840a;

    public a(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121840a = gVar.h(f121839b);
    }

    private File a() {
        return this.f121840a;
    }

    public JSONObject b() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.internal.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File fileA = a();
            if (fileA.exists()) {
                fileInputStream = new FileInputStream(fileA);
                try {
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.i.E(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        com.google.firebase.crashlytics.internal.g.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                com.google.firebase.crashlytics.internal.g.f().k("Settings file does not exist.");
                jSONObject = null;
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        com.google.firebase.crashlytics.internal.g.f().k("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.internal.g.f().e("Failed to cache settings", e);
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
