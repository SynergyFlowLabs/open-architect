package pf;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.io.l;
import kotlin.io.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nKMMCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KMMCaching.kt\ncom/sdk/growthbook/sandbox/CachingAndroid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class b implements d {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static File f350182b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Json f350183a = JsonKt.Json$default(null, new Function1() { // from class: pf.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b.g((JsonBuilder) obj);
        }
    }, 1, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            c(context.getFilesDir());
        }

        @Nullable
        public final File b() {
            return b.f350182b;
        }

        public final void c(@Nullable File file) {
            b.f350182b = file;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setPrettyPrint(true);
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @Override // pf.d
    public void a(@NotNull String fileName, @NotNull JsonElement content) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(content, "content");
        File fileF = f(fileName);
        if (fileF != null) {
            if (fileF.exists()) {
                fileF.delete();
            }
            fileF.createNewFile();
            int i10 = 3 & 0;
            l.i(fileF, this.f350183a.encodeToString(JsonElement.Companion.serializer(), content), null, 2, null);
        }
    }

    @Override // pf.d
    @Nullable
    public JsonElement b(@NotNull String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File fileF = f(fileName);
        if (fileF == null || !fileF.exists()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileF), Charsets.UTF_8), 8192);
        try {
            String strK = x.k(bufferedReader);
            kotlin.io.c.a(bufferedReader, null);
            return (JsonElement) this.f350183a.decodeFromString(JsonElement.Companion.serializer(), strK);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public final File f(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (f350182b == null) {
            int i10 = 5 | 0;
            return null;
        }
        File file = new File(f350182b, "GrowthBook-KMM");
        file.mkdirs();
        if (StringsKt.L1(fileName, ".txt", true)) {
            fileName = StringsKt.j4(fileName, ".txt");
        }
        return new File(file, fileName + ".txt");
    }
}
