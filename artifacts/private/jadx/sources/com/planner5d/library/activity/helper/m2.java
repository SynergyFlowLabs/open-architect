package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import com.planner5d.library.model.manager.p5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class m2 implements p5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f137054b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j2 f137055a;

    @ij.a
    public m2(@NotNull j2 missingActivityForUriHandler) {
        Intrinsics.checkNotNullParameter(missingActivityForUriHandler, "missingActivityForUriHandler");
        this.f137055a = missingActivityForUriHandler;
    }

    @Override // com.planner5d.library.model.manager.p5
    public void a(@Nullable Activity activity, @Nullable String str) {
        try {
            com.planner5d.library.services.utility.i2.b(activity, str);
        } catch (ActivityNotFoundException unused) {
            this.f137055a.a(str);
        }
    }
}
