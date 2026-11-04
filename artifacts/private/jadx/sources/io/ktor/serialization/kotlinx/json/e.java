package io.ktor.serialization.kotlinx.json;

import io.ktor.http.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Json f296465a = JsonKt.Json$default(null, new Function1() { // from class: io.ktor.serialization.kotlinx.json.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return e.b((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setLenient(true);
        Json.setAllowSpecialFloatingPointValues(true);
        Json.setAllowStructuredMapKeys(true);
        Json.setPrettyPrint(false);
        Json.setUseArrayPolymorphism(false);
        return Unit.f312394a;
    }

    @NotNull
    public static final Json c() {
        return f296465a;
    }

    public static final void d(@NotNull io.ktor.serialization.b bVar, @NotNull Json json, @NotNull m contentType) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        io.ktor.serialization.kotlinx.d.b(bVar, contentType, json);
    }

    public static /* synthetic */ void e(io.ktor.serialization.b bVar, Json json, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            json = f296465a;
        }
        if ((i10 & 2) != 0) {
            mVar = m.a.f295985a.k();
        }
        d(bVar, json, mVar);
    }

    @kotlinx.serialization.g
    public static final void f(@NotNull io.ktor.serialization.b bVar, @NotNull Json json, @NotNull m contentType) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        io.ktor.serialization.b.a.b(bVar, contentType, new a(json), null, 4, null);
    }

    public static /* synthetic */ void g(io.ktor.serialization.b bVar, Json json, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            json = f296465a;
        }
        if ((i10 & 2) != 0) {
            mVar = m.a.f295985a.k();
        }
        f(bVar, json, mVar);
    }
}
