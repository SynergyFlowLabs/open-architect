package com.airbnb.lottie.model;

import androidx.annotation.b1;
import com.airbnb.lottie.model.content.q;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<q> f88529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f88530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f88531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f88532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f88533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f88534f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f88529a = list;
        this.f88530b = c10;
        this.f88531c = d10;
        this.f88532d = d11;
        this.f88533e = str;
        this.f88534f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f88529a;
    }

    public double b() {
        return this.f88532d;
    }

    public int hashCode() {
        return c(this.f88530b, this.f88534f, this.f88533e);
    }
}
