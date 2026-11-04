package com.google.vr.vrcore.controller.api;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static final String a(int i10) {
        if (i10 == 0) {
            return "SUCCESS";
        }
        if (i10 == 1) {
            return "FAILED_UNSUPPORTED";
        }
        if (i10 == 2) {
            return "FAILED_NOT_AUTHORIZED";
        }
        if (i10 == 3) {
            return "FAILED_CLIENT_OBSOLETE";
        }
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("[UNKNOWN CONTROLLER INIT RESULT: ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }
}
