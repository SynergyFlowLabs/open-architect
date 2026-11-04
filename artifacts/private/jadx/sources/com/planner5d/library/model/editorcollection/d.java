package com.planner5d.library.model.editorcollection;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.y;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nConverterTexture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConverterTexture.kt\ncom/planner5d/library/model/editorcollection/ConverterTexture\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class d implements a<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f180686a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final f0 f180687b = g0.c(new Function0() { // from class: com.planner5d.library.model.editorcollection.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.g();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180688c = 8;

    private d() {
    }

    private final k5 f() {
        return (k5) f180687b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k5 g() {
        return com.planner5d.library.application.b.f142455c.a().T0();
    }

    public static /* synthetic */ g.b j(d dVar, String str, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return dVar.i(str, num);
    }

    @Override // com.planner5d.library.model.editorcollection.a
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public y b(@NotNull g.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.b() != g.c.Texture) {
            this = null;
        }
        if (this != null) {
            return this.e(value.a());
        }
        return null;
    }

    @m1
    @NotNull
    public final y e(@NotNull String id2) throws JSONException {
        Intrinsics.checkNotNullParameter(id2, "id");
        JSONObject jSONObject = new JSONObject(id2);
        String string = jSONObject.getString(com.planner5d.library.services.r.textureName.f224891a);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.color;
        if (jSONObject.has(rVar.f224891a)) {
            return new y(string, jSONObject.getInt(rVar.f224891a));
        }
        y yVarQ = f().q(string);
        Intrinsics.checkNotNullExpressionValue(yVarQ, "get(...)");
        return yVarQ;
    }

    @Override // com.planner5d.library.model.editorcollection.a
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.b a(@NotNull y value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String name = value.f222851c;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return j(this, name, null, 2, null);
    }

    @NotNull
    public final g.b i(@NotNull String name, @Nullable Integer num) throws JSONException {
        Intrinsics.checkNotNullParameter(name, "name");
        g.c cVar = g.c.Texture;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.planner5d.library.services.r.textureName.f224891a, name);
        if (num != null) {
            jSONObject.put(com.planner5d.library.services.r.color.f224891a, num.intValue());
        }
        return new g.b(cVar, jSONObject);
    }
}
