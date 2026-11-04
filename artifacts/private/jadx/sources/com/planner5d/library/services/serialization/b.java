package com.planner5d.library.services.serialization;

import androidx.annotation.m1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kotlin.Unit;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nObjectSerializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializationUtils.kt\ncom/planner5d/library/services/serialization/ObjectSerializationUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f224965a = new b();

    private b() {
    }

    @m1
    @NotNull
    public final Object a(@NotNull byte[] serializedInstance) throws IOException, ClassNotFoundException {
        Intrinsics.checkNotNullParameter(serializedInstance, "serializedInstance");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedInstance);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                c.a(objectInputStream, null);
                c.a(byteArrayInputStream, null);
                Intrinsics.checkNotNullExpressionValue(object, "use(...)");
                return object;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c.a(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    @m1
    @NotNull
    public final byte[] b(@NotNull Object instance) throws IOException {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(instance);
                Unit unit = Unit.f312394a;
                c.a(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                c.a(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c.a(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }
}
