package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class i<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f96613f = "DecodePath";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<DataType> f96614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.l<DataType, ResourceType>> f96615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f96616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.s.a<List<Throwable>> f96617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f96618e;

    interface a<ResourceType> {
        @NonNull
        v<ResourceType> a(@NonNull v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.l<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, androidx.core.util.s.a<List<Throwable>> aVar) {
        this.f96614a = cls;
        this.f96615b = list;
        this.f96616c = eVar;
        this.f96617d = aVar;
        this.f96618e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws q {
        List<Throwable> list = (List) com.bumptech.glide.util.k.d(this.f96617d.acquire());
        try {
            v<ResourceType> vVarC = c(eVar, i10, i11, jVar, list);
            this.f96617d.a(list);
            return vVarC;
        } catch (Throwable th2) {
            this.f96617d.a(list);
            throw th2;
        }
    }

    @NonNull
    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar, List<Throwable> list) throws q {
        int size = this.f96615b.size();
        v<ResourceType> vVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            com.bumptech.glide.load.l<DataType, ResourceType> lVar = this.f96615b.get(i12);
            try {
                if (lVar.a(eVar.a(), jVar)) {
                    vVarB = lVar.b(eVar.a(), i10, i11, jVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable(f96613f, 2)) {
                    Objects.toString(lVar);
                }
                list.add(e10);
            }
            if (vVarB != null) {
                break;
            }
        }
        if (vVarB != null) {
            return vVarB;
        }
        throw new q(this.f96618e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar, a<ResourceType> aVar) throws q {
        return this.f96616c.a(aVar.a(b(eVar, i10, i11, jVar)), jVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f96614a + ", decoders=" + this.f96615b + ", transcoder=" + this.f96616c + AbstractJsonLexerKt.END_OBJ;
    }
}
