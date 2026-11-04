package com.rabbitmq.client;

import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes13.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f265080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f265081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f265082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f265083d = "amq.rabbitmq.reply-to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f265084e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f265085f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function<Object, e1.c> f265086g = e1.f265056n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Supplier<String> f265087h = e1.p();

    public f1() {
        boolean z10 = false & false;
    }

    public f1 a(k kVar) {
        this.f265080a = kVar;
        return this;
    }

    public f1 b(Supplier<String> supplier) {
        this.f265087h = supplier;
        return this;
    }

    public f1 c(String str) {
        this.f265081b = str;
        return this;
    }

    public k d() {
        return this.f265080a;
    }

    public Supplier<String> e() {
        return this.f265087h;
    }

    public String f() {
        return this.f265081b;
    }

    public Function<Object, e1.c> g() {
        return this.f265086g;
    }

    public String h() {
        return this.f265083d;
    }

    public String i() {
        return this.f265082c;
    }

    public int j() {
        return this.f265084e;
    }

    public f1 k(Function<Object, e1.c> function) {
        this.f265086g = function;
        return this;
    }

    public f1 l(String str) {
        this.f265083d = str;
        return this;
    }

    public f1 m(String str) {
        this.f265082c = str;
        return this;
    }

    public boolean n() {
        return this.f265085f;
    }

    public f1 o(int i10) {
        this.f265084e = i10;
        return this;
    }

    public f1 p() {
        return q(true);
    }

    public f1 q(boolean z10) {
        this.f265085f = z10;
        return this;
    }
}
