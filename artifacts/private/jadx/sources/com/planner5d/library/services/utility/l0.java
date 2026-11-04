package com.planner5d.library.services.utility;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nDrawablesDumper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablesDumper.kt\ncom/planner5d/library/services/utility/DrawablesDumper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Resources f225302a;

    public l0(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f225302a = resources;
    }

    @NotNull
    public final String a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        StringBuilder sb2 = new StringBuilder();
        Iterator itA = kotlin.jvm.internal.i.a(o2.g.class.getFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            try {
                BitmapFactory.decodeResource(this.f225302a, field.getInt(null), options);
                Integer numValueOf = Integer.valueOf(options.outWidth);
                int i10 = 5 | (-1);
                Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    sb2.append(field.getName() + " " + iIntValue);
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                    sb2.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                }
            } catch (Exception unused) {
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
