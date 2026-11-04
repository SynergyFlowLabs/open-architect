package com.google.api.client.googleapis.notifications;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public class e<T> extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private T f115479i;

    public e(long j10, String str, String str2, String str3, String str4) {
        super(j10, str, str2, str3, str4);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public e<T> p(String str) {
        return (e) super.p(str);
    }

    public final T r() {
        return this.f115479i;
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e<T> i(String str) {
        return (e) super.i(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e<T> j(String str) {
        return (e) super.j(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    public String toString() {
        return super.q().a(FirebaseAnalytics.d.P, this.f115479i).toString();
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public e<T> k(String str) {
        return (e) super.k(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public e<T> l(String str) {
        return (e) super.l(str);
    }

    public e<T> w(T t10) {
        this.f115479i = t10;
        return this;
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public e<T> m(long j10) {
        return (e) super.m(j10);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e<T> n(String str) {
        return (e) super.n(str);
    }

    @Override // com.google.api.client.googleapis.notifications.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public e<T> o(String str) {
        return (e) super.o(str);
    }

    public e(g gVar) {
        super(gVar);
    }
}
