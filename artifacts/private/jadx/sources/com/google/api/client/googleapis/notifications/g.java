package com.google.api.client.googleapis.notifications;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class g extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f115481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputStream f115482j;

    public g(long j10, String str, String str2, String str3, String str4) {
        super(j10, str, str2, str3, str4);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public g n(String str) {
        return (g) super.n(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public g o(String str) {
        return (g) super.o(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public g p(String str) {
        return (g) super.p(str);
    }

    public final InputStream r() {
        return this.f115482j;
    }

    public final String s() {
        return this.f115481i;
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public g i(String str) {
        return (g) super.i(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    public String toString() {
        return super.q().a("contentType", this.f115481i).toString();
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public g j(String str) {
        return (g) super.j(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public g k(String str) {
        return (g) super.k(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g l(String str) {
        return (g) super.l(str);
    }

    public g x(InputStream inputStream) {
        this.f115482j = inputStream;
        return this;
    }

    public g y(String str) {
        this.f115481i = str;
        return this;
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g m(long j10) {
        return (g) super.m(j10);
    }
}
