package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import android.app.Application;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.l;
import com.planner5d.library.model.manager.builtin.e1;
import com.planner5d.library.model.p;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHashesMetadataLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashesMetadataLoader.kt\ncom/planner5d/library/model/manager/builtin/materialsmetadataloading/HashesMetadataLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class b extends f<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f181108j = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.jsonparser.a<Map<String, String>> f181109i;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f181110f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Application f181111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.d.g f181112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final c2 f181113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final i1 f181114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final z f181115e;

        @ij.a
        public a(@NotNull Application application, @NotNull com.planner5d.library.services.bitmaploader.d.g uriLoader, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor, @NotNull z privateFiles) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(uriLoader, "uriLoader");
            Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
            Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
            Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
            this.f181111a = application;
            this.f181112b = uriLoader;
            this.f181113c = networkStateUtility;
            this.f181114d = internetStateMonitor;
            this.f181115e = privateFiles;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final b a(@NotNull e1 materialFilePaths, @NotNull Map<String, ? extends p> materials) {
            Intrinsics.checkNotNullParameter(materialFilePaths, "materialFilePaths");
            Intrinsics.checkNotNullParameter(materials, "materials");
            return new b(this.f181111a, this.f181112b, materialFilePaths, com.planner5d.library.model.manager.builtin.materialsmetadataloading.a.f181104a.a(), this.f181113c, this.f181114d, this.f181115e, new C1571b(new com.planner5d.library.services.download.p(materials), null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Application application, @NotNull com.planner5d.library.services.bitmaploader.d.g uriLoader, @NotNull e1 materialFilePaths, @NotNull g dataPaths, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor, @NotNull z privateFiles, @NotNull com.planner5d.library.services.jsonparser.a<Map<String, String>> hashesParser) {
        super(application, uriLoader, materialFilePaths, dataPaths, networkStateUtility, internetStateMonitor, privateFiles);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(uriLoader, "uriLoader");
        Intrinsics.checkNotNullParameter(materialFilePaths, "materialFilePaths");
        Intrinsics.checkNotNullParameter(dataPaths, "dataPaths");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        Intrinsics.checkNotNullParameter(hashesParser, "hashesParser");
        this.f181109i = hashesParser;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.builtin.materialsmetadataloading.f
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> f(@Nullable InputStream inputStream) {
        return MapsKt.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.builtin.materialsmetadataloading.f
    @m1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map<String, String> h(@NotNull InputStream inputStream) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        try {
            Map<String, String> mapB = this.f181109i.b(gZIPInputStream);
            kotlin.io.c.a(gZIPInputStream, null);
            return mapB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(gZIPInputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nHashesMetadataLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashesMetadataLoader.kt\ncom/planner5d/library/model/manager/builtin/materialsmetadataloading/HashesMetadataLoader$HashesJsonParser\n+ 2 JsonReader.kt\ncom/planner5d/library/services/jsonparser/JsonReader\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n52#2,10:93\n72#2,19:104\n63#2,6:123\n1#3:103\n*S KotlinDebug\n*F\n+ 1 HashesMetadataLoader.kt\ncom/planner5d/library/model/manager/builtin/materialsmetadataloading/HashesMetadataLoader$HashesJsonParser\n*L\n66#1:93,10\n70#1:104,19\n66#1:123,6\n*E\n"})
    private static final class C1571b extends com.planner5d.library.services.jsonparser.a<Map<String, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.download.p f181116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final l.a f181117b;

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$a */
        public /* synthetic */ class a extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f181118a = new a();

            public a() {
                super(1, JsonReader.class, "beginObject", "beginObject()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.beginObject();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C1572b extends g0 implements Function1<JsonReader, String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1572b f181119a = new C1572b();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1572b() {
                super(1, JsonReader.class, "nextName", "nextName()Ljava/lang/String;", 0);
                int i10 = 5 << 1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final String invoke(JsonReader p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return p10.nextName();
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$c */
        public /* synthetic */ class c extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f181120a = new c();

            public c() {
                super(1, JsonReader.class, "skipValue", "skipValue()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.skipValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$d */
        public /* synthetic */ class d extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f181121a = new d();

            public d() {
                super(1, JsonReader.class, "endObject", "endObject()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.endObject();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$e */
        public /* synthetic */ class e extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f181122a = new e();

            public e() {
                super(1, JsonReader.class, "beginArray", "beginArray()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.beginArray();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$f */
        public /* synthetic */ class f extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f181123a = new f();

            public f() {
                super(1, JsonReader.class, "skipValue", "skipValue()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.skipValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.model.manager.builtin.materialsmetadataloading.b$b$g */
        public /* synthetic */ class g extends g0 implements Function1<JsonReader, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f181124a = new g();

            public g() {
                super(1, JsonReader.class, "endArray", "endArray()V", 0);
            }

            public final void X(JsonReader p10) throws IOException {
                Intrinsics.checkNotNullParameter(p10, "p0");
                p10.endArray();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonReader jsonReader) throws IOException {
                X(jsonReader);
                return Unit.f312394a;
            }
        }

        public /* synthetic */ C1571b(com.planner5d.library.services.download.p pVar, l.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(pVar, (i10 & 2) != 0 ? new l.a() : aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.planner5d.library.services.jsonparser.a
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<String, String> a(@NotNull com.planner5d.library.services.jsonparser.b bVar) throws IllegalStateException, IOException {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            bVar.a(a.f181118a);
            while (bVar.s() != JsonToken.END_OBJECT) {
                String str = (String) bVar.a(C1572b.f181119a);
                long j10 = bVar.j();
                JsonToken jsonTokenS = bVar.s();
                if (jsonTokenS == JsonToken.BOOLEAN || jsonTokenS == JsonToken.NUMBER || jsonTokenS == JsonToken.STRING || jsonTokenS == JsonToken.NULL || jsonTokenS == JsonToken.BEGIN_OBJECT || jsonTokenS == JsonToken.BEGIN_ARRAY) {
                    Intrinsics.checkNotNull(str);
                    l lVarA = this.f181117b.a(str);
                    if (lVarA != null && this.f181116a.a(lVarA)) {
                        bVar.a(e.f181122a);
                        while (true) {
                            long j11 = bVar.j();
                            JsonToken jsonTokenS2 = bVar.s();
                            if (jsonTokenS2 != JsonToken.BOOLEAN && jsonTokenS2 != JsonToken.NUMBER && jsonTokenS2 != JsonToken.STRING && jsonTokenS2 != JsonToken.NULL && jsonTokenS2 != JsonToken.BEGIN_OBJECT && jsonTokenS2 != JsonToken.BEGIN_ARRAY) {
                                if (jsonTokenS2 == JsonToken.END_ARRAY) {
                                    break;
                                }
                            } else if (bVar.r()) {
                                linkedHashMap.put(str, bVar.i());
                            }
                            if (bVar.j() == j11) {
                                bVar.a(f.f181123a);
                            }
                        }
                        bVar.a(g.f181124a);
                    }
                }
                if (bVar.j() == j10) {
                    bVar.a(c.f181120a);
                }
            }
            bVar.a(d.f181121a);
            return linkedHashMap;
        }

        public C1571b(@NotNull com.planner5d.library.services.download.p hashesFilter, @NotNull l.a hashMetadataParser) {
            Intrinsics.checkNotNullParameter(hashesFilter, "hashesFilter");
            Intrinsics.checkNotNullParameter(hashMetadataParser, "hashMetadataParser");
            this.f181116a = hashesFilter;
            this.f181117b = hashMetadataParser;
        }
    }
}
