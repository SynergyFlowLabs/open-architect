package com.planner5d.library.services.utility;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f225295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f225296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<T> f225297c;

    public interface a {
        void reset();
    }

    public k2(int i10, int i11) {
        this.f225297c = new ArrayList(i10);
        this.f225295a = i11;
    }

    public void a() {
        this.f225297c.clear();
    }

    public void b(T t10) {
        if (t10 == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        if (this.f225297c.size() < this.f225295a) {
            this.f225297c.add(t10);
            this.f225296b = Math.max(this.f225296b, this.f225297c.size());
        }
        if (t10 instanceof a) {
            ((a) t10).reset();
        }
    }

    public int c() {
        return this.f225297c.size();
    }

    protected abstract T d();

    public T e() {
        if (this.f225297c.size() == 0) {
            return d();
        }
        List<T> list = this.f225297c;
        return list.remove(list.size() - 1);
    }
}
