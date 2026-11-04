package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f121927a = "fire-cls-ndk";

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.internal.a b(com.google.firebase.components.h hVar) {
        Context context = (Context) hVar.a(Context.class);
        return e.f(context, !com.google.firebase.crashlytics.internal.f.g(context));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.g.h(com.google.firebase.crashlytics.internal.a.class).h(f121927a).b(v.m(Context.class)).f(new com.google.firebase.components.k() { // from class: com.google.firebase.crashlytics.ndk.b
            @Override // com.google.firebase.components.k
            public final Object a(com.google.firebase.components.h hVar) {
                return this.f121935a.b(hVar);
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(f121927a, "20.0.1"));
    }
}
