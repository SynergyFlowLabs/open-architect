package com.planner5d.library.services;

import android.util.Xml;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nXmlBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlBuilder.kt\ncom/planner5d/library/services/XmlBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f229886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final OutputStream f229887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final XmlSerializer f229888c;

    public v0(@NotNull String root, @NotNull File file) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f229886a = root;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f229887b = fileOutputStream;
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            xmlSerializerNewSerializer.setOutput(fileOutputStream, "UTF-8");
            this.f229888c = xmlSerializerNewSerializer;
            a(root);
        } catch (Throwable th2) {
            b();
            throw new RuntimeException(th2);
        }
    }

    private final void b() {
        org.apache.commons.io.p.l(this.f229887b);
    }

    private final void d(Throwable th2) {
        b();
        throw new RuntimeException(th2);
    }

    @NotNull
    public final v0 a(@NotNull String node) {
        Intrinsics.checkNotNullParameter(node, "node");
        try {
            this.f229888c.startTag("", node);
            return this;
        } catch (Throwable th2) {
            d(th2);
            return this;
        }
    }

    @NotNull
    public final v0 c(@NotNull String node) {
        Intrinsics.checkNotNullParameter(node, "node");
        try {
            this.f229888c.endTag("", node);
            return this;
        } catch (Throwable th2) {
            d(th2);
            return this;
        }
    }

    public final void e() {
        try {
            this.f229888c.endTag("", this.f229886a);
            this.f229888c.endDocument();
            b();
        } catch (Throwable th2) {
            d(th2);
        }
    }

    @NotNull
    public final v0 f(@NotNull String name, float f10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return i(name, String.valueOf(f10));
    }

    @NotNull
    public final v0 g(@NotNull String name, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(name, "name");
        return i(name, f10 + " " + f11 + " " + f12);
    }

    @NotNull
    public final v0 h(@NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return i(name, String.valueOf(i10));
    }

    @NotNull
    public final v0 i(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.f229888c.attribute("", name, value);
            return this;
        } catch (Throwable th2) {
            d(th2);
            return this;
        }
    }
}
