package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class t<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Data> f96742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.util.s.a<List<Throwable>> f96743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f96744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f96745d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, androidx.core.util.s.a<List<Throwable>> aVar) {
        this.f96742a = cls;
        this.f96743b = aVar;
        this.f96744c = (List) com.bumptech.glide.util.k.c(list);
        this.f96745d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @NonNull com.bumptech.glide.load.j jVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f96744c.size();
        v<Transcode> vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = this.f96744c.get(i12).a(eVar, i10, i11, jVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f96745d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.f96742a;
    }

    public v<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @NonNull com.bumptech.glide.load.j jVar, int i10, int i11, i.a<ResourceType> aVar) throws q {
        List<Throwable> list = (List) com.bumptech.glide.util.k.d(this.f96743b.acquire());
        try {
            v<Transcode> vVarC = c(eVar, jVar, i10, i11, aVar, list);
            androidx.core.util.s.a<List<Throwable>> aVar2 = this.f96743b;
            return vVarC;
        } finally {
            this.f96743b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f96744c.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
