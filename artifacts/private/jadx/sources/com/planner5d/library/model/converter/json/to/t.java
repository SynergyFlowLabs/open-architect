package com.planner5d.library.model.converter.json.to;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemUnknown;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nFromItemUnknown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FromItemUnknown.kt\ncom/planner5d/library/model/converter/json/to/FromItemUnknown\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class t extends a<ItemUnknown> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180669b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f180670a = {"aY", androidx.media3.exoplayer.upstream.h.f65998l};

    @ij.a
    public t() {
    }

    @Override // com.planner5d.library.model.converter.json.to.a, ib.a
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JSONObject convert(@NotNull ItemUnknown item) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        JSONObject jSONObject = new JSONObject(item.getJson().toString());
        a(jSONObject, "puid", item.getUid());
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        ItemLayout layout = item.getLayout(new ItemLayout());
        String[] strArr = this.f180670a;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str = null;
                break;
            }
            str = strArr[i10];
            if (jSONObject.has(str)) {
                break;
            }
            i10++;
        }
        if (str != null) {
            jSONObject.put(str, layout.getRotationY());
        }
        if (!jSONObject.has("x") && !jSONObject.has("y") && !jSONObject.has("z")) {
            return jSONObject;
        }
        jSONObject.put("x", layout.getPosition(mVar).f180482a).put("y", mVar.f180483b).put("z", mVar.f180484c);
        return jSONObject;
    }
}
