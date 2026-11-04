package com.google.gson.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements com.google.gson.c0, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f125527g = -1.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f125528h = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f125529a = f125527g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f125530b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f125531c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f125532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f125533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f125534f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends com.google.gson.b0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile com.google.gson.b0<T> f125535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f125536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f125537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f125538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f125539e;

        a(boolean z10, boolean z11, com.google.gson.f fVar, com.google.gson.reflect.a aVar) {
            this.f125536b = z10;
            this.f125537c = z11;
            this.f125538d = fVar;
            this.f125539e = aVar;
        }

        private com.google.gson.b0<T> a() {
            com.google.gson.b0<T> b0Var = this.f125535a;
            if (b0Var != null) {
                return b0Var;
            }
            com.google.gson.b0<T> b0VarV = this.f125538d.v(w.this, this.f125539e);
            this.f125535a = b0VarV;
            return b0VarV;
        }

        @Override // com.google.gson.b0
        public T read(com.google.gson.stream.a aVar) throws IOException {
            if (!this.f125536b) {
                return a().read(aVar);
            }
            aVar.a9();
            return null;
        }

        @Override // com.google.gson.b0
        public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
            if (this.f125537c) {
                dVar.y();
            } else {
                a().write(dVar, t10);
            }
        }
    }

    public w() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f125533e = list;
        this.f125534f = list;
    }

    private static boolean f(Class<?> cls) {
        return cls.isMemberClass() && !com.google.gson.internal.reflect.a.n(cls);
    }

    private boolean g(com.google.gson.annotations.d dVar) {
        if (dVar != null) {
            return this.f125529a >= dVar.value();
        }
        return true;
    }

    private boolean h(com.google.gson.annotations.e eVar) {
        if (eVar != null) {
            return this.f125529a < eVar.value();
        }
        return true;
    }

    private boolean i(com.google.gson.annotations.d dVar, com.google.gson.annotations.e eVar) {
        return g(dVar) && h(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w clone() {
        try {
            return (w) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public w b() {
        w wVarClone = clone();
        wVarClone.f125531c = false;
        return wVarClone;
    }

    public boolean c(Class<?> cls, boolean z10) {
        if (this.f125529a != f125527g && !i((com.google.gson.annotations.d) cls.getAnnotation(com.google.gson.annotations.d.class), (com.google.gson.annotations.e) cls.getAnnotation(com.google.gson.annotations.e.class))) {
            return true;
        }
        if (!this.f125531c && f(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && com.google.gson.internal.reflect.a.l(cls)) {
            return true;
        }
        Iterator<com.google.gson.a> it = (z10 ? this.f125533e : this.f125534f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.c0
    public <T> com.google.gson.b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean zC = c(rawType, true);
        boolean zC2 = c(rawType, false);
        if (zC || zC2) {
            return new a(zC2, zC, fVar, aVar);
        }
        return null;
    }

    public boolean d(Field field, boolean z10) {
        com.google.gson.annotations.a aVar;
        if ((this.f125530b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f125529a != f125527g && !i((com.google.gson.annotations.d) field.getAnnotation(com.google.gson.annotations.d.class), (com.google.gson.annotations.e) field.getAnnotation(com.google.gson.annotations.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f125532d && ((aVar = (com.google.gson.annotations.a) field.getAnnotation(com.google.gson.annotations.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) || c(field.getType(), z10)) {
            return true;
        }
        List<com.google.gson.a> list = z10 ? this.f125533e : this.f125534f;
        if (!list.isEmpty()) {
            com.google.gson.b bVar = new com.google.gson.b(field);
            Iterator<com.google.gson.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().b(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public w e() {
        w wVarClone = clone();
        wVarClone.f125532d = true;
        return wVarClone;
    }

    public w j(com.google.gson.a aVar, boolean z10, boolean z11) {
        w wVarClone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f125533e);
            wVarClone.f125533e = arrayList;
            arrayList.add(aVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f125534f);
            wVarClone.f125534f = arrayList2;
            arrayList2.add(aVar);
        }
        return wVarClone;
    }

    public w k(int... iArr) {
        w wVarClone = clone();
        wVarClone.f125530b = 0;
        for (int i10 : iArr) {
            wVarClone.f125530b = i10 | wVarClone.f125530b;
        }
        return wVarClone;
    }

    public w l(double d10) {
        w wVarClone = clone();
        wVarClone.f125529a = d10;
        return wVarClone;
    }
}
