package com.google.api.client.json.rpc2;

import com.google.api.client.util.f;
import com.google.api.client.util.s;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v
    private final String f115791c = "2.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private Object f115792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v
    private String f115793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v
    private Object f115794f;

    @Override // com.google.api.client.util.s, java.util.AbstractMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return (a) super.clone();
    }

    public Object h() {
        return this.f115792d;
    }

    public String i() {
        return this.f115793e;
    }

    public Object j() {
        return this.f115794f;
    }

    public String k() {
        return "2.0";
    }

    @Override // com.google.api.client.util.s
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a e(String str, Object obj) {
        return (a) super.e(str, obj);
    }

    public void n(Object obj) {
        this.f115792d = obj;
    }

    public void o(String str) {
        this.f115793e = str;
    }

    public void p(Object obj) {
        this.f115794f = obj;
    }
}
