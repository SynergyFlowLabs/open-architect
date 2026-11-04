package com.segment.analytics.kotlin.core.utilities;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventStream.kt\ncom/segment/analytics/kotlin/core/utilities/InMemoryEventStream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n1#2:252\n*E\n"})
public class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, a> f267007a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f267008b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f267009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final StringBuilder f267010b;

        public a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f267009a = name;
            this.f267010b = new StringBuilder();
        }

        @NotNull
        public final StringBuilder a() {
            return this.f267010b;
        }

        public final int b() {
            return this.f267010b.length();
        }

        @NotNull
        public final String c() {
            return this.f267009a;
        }

        @NotNull
        public final ByteArrayInputStream d() {
            String string = this.f267010b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "fileStream.toString()");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }

        public final StringBuilder e(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            StringBuilder sb2 = this.f267010b;
            sb2.append(content);
            return sb2;
        }
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void a(@Nullable Function1<? super String, String> function1) {
        a aVarE = e();
        if (aVarE != null) {
            if (function1 != null) {
                this.f267007a.remove(aVarE.c());
                this.f267007a.put(function1.invoke(aVarE.c()), aVarE);
            }
            g(null);
        }
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    @Nullable
    public InputStream b(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        a aVar = this.f267007a.get(source);
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public boolean c() {
        return e() != null;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void close() {
        g(null);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public boolean d(@NotNull String file) {
        boolean z10;
        Intrinsics.checkNotNullParameter(file, "file");
        a aVarE = e();
        if (aVarE != null && !Intrinsics.areEqual(aVarE.c(), file)) {
            close();
        }
        if (e() == null) {
            boolean zContainsKey = this.f267007a.containsKey(file);
            z10 = !zContainsKey;
            g(!zContainsKey ? new a(file) : this.f267007a.get(file));
        } else {
            z10 = false;
        }
        a aVarE2 = e();
        if (aVarE2 != null) {
            this.f267007a.put(file, aVarE2);
        }
        return z10;
    }

    @Nullable
    protected a e() {
        return this.f267008b;
    }

    @NotNull
    protected final ConcurrentHashMap<String, a> f() {
        return this.f267007a;
    }

    protected void g(@Nullable a aVar) {
        this.f267008b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public long getLength() {
        a aVarE = e();
        return aVarE != null ? aVarE.b() : 0;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    @NotNull
    public List<String> read() {
        Enumeration<String> enumerationKeys = this.f267007a.keys();
        Intrinsics.checkNotNullExpressionValue(enumerationKeys, "directory.keys()");
        ArrayList list = Collections.list(enumerationKeys);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        return list;
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void remove(@NotNull String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f267007a.remove(file);
    }

    @Override // com.segment.analytics.kotlin.core.utilities.f
    public void write(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        a aVarE = e();
        if (aVarE != null) {
            aVarE.e(content);
        }
    }
}
