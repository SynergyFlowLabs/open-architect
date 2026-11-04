package com.planner5d.library.rabbitmq;

import com.squareup.moshi.w;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.channels.v;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p<T> f223933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.squareup.moshi.h<T> f223934b;

    /* JADX INFO: renamed from: com.planner5d.library.rabbitmq.a$a, reason: collision with other inner class name */
    public static final class C1659a implements pe.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<T> f223935a;

        C1659a(a<T> aVar) {
            this.f223935a = aVar;
        }

        @Override // pe.e
        public void a(JSONObject jSONObject) {
            this.f223935a.c(jSONObject);
        }

        @Override // pe.e
        public void b(JSONObject jSONObject) {
            this.f223935a.c(jSONObject);
        }

        @Override // pe.e
        public void c(JSONObject jSONObject) {
            this.f223935a.c(jSONObject);
        }

        @Override // pe.e
        public void d(JSONObject jSONObject) {
            this.f223935a.c(jSONObject);
        }
    }

    public a(@NotNull Class<T> responseType, @NotNull p<T> channel) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f223933a = channel;
        this.f223934b = new w.c().i().c(responseType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(JSONObject jSONObject) {
        try {
            v.m0(this.f223933a, this.f223934b.c(String.valueOf(jSONObject)));
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to parse response '" + (jSONObject != null ? jSONObject.toString() : null) + "'", new Object[0]);
            this.f223933a.F(e10);
        }
    }

    @NotNull
    public final pe.e b() {
        return new C1659a(this);
    }
}
