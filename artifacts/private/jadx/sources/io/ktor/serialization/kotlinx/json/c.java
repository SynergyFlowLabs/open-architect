package io.ktor.serialization.kotlinx.json;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JvmStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Sequence<? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.h f296462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ri.b f296463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Json f296464d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.utils.io.h hVar, ri.b bVar, Json json, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f296462b = hVar;
            this.f296463c = bVar;
            this.f296464d = json;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f296462b, this.f296463c, this.f296464d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f296461a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 5 >> 0;
            return JvmStreamsKt.decodeToSequence$default(this.f296464d, io.ktor.utils.io.jvm.javaio.a.b(this.f296462b, null, 1, null), io.ktor.serialization.kotlinx.h.d(this.f296464d.getSerializersModule(), h.a(this.f296463c)), null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Sequence<? extends Object>> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull Json json, @NotNull io.ktor.utils.io.h hVar, @NotNull ri.b bVar, @NotNull kotlin.coroutines.d<? super Sequence<? extends Object>> dVar) {
        return i.h(l1.c(), new a(hVar, bVar, json, null), dVar);
    }
}
