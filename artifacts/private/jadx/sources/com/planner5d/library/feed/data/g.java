package com.planner5d.library.feed.data;

import com.planner5d.library.services.utility.a1;
import com.planner5d.library.services.z;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f175280b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f175281c = "galleryRecords.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z f175282a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public g(@NotNull z privateFiles) {
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        this.f175282a = privateFiles;
    }

    @NotNull
    public final JSONArray a() throws IOException {
        FileInputStream fileInputStreamC = this.f175282a.c(f175281c);
        try {
            JSONArray jSONArrayE = new a1().e(fileInputStreamC);
            if (jSONArrayE == null) {
                jSONArrayE = new JSONArray();
            }
            kotlin.io.c.a(fileInputStreamC, null);
            return jSONArrayE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileInputStreamC, th2);
                throw th3;
            }
        }
    }

    public final void b(@NotNull JSONArray data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        FileOutputStream fileOutputStreamD = this.f175282a.d(f175281c);
        try {
            String string = data.toString(0);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStreamD.write(bytes);
            fileOutputStreamD.flush();
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(fileOutputStreamD, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(fileOutputStreamD, th2);
                throw th3;
            }
        }
    }
}
