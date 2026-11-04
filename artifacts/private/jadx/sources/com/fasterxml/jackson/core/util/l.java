package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class l implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f102830d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f102831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected CharSequence f102832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f102833c;

    public l(byte[] bArr, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        this.f102831a = bArr;
        this.f102833c = (str == null || str.isEmpty()) ? "UTF-8" : str;
    }

    public Object a() {
        byte[] bArr = this.f102831a;
        return bArr != null ? bArr : this.f102832b;
    }

    public String toString() {
        byte[] bArr = this.f102831a;
        if (bArr == null) {
            return this.f102832b.toString();
        }
        try {
            return new String(bArr, this.f102833c);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public l(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException();
        }
        this.f102832b = charSequence;
    }
}
