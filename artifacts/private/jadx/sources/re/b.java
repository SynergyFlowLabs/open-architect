package re;

import androidx.room.s2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b<T extends Serializable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<T> f366636a;

    public b(@NotNull Class<T> typeMarker) {
        Intrinsics.checkNotNullParameter(typeMarker, "typeMarker");
        this.f366636a = typeMarker;
    }

    @s2
    @Nullable
    public final T a(@Nullable byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
        try {
            Object object = objectInputStream.readObject();
            c.a(objectInputStream, null);
            if (this.f366636a.isAssignableFrom(object.getClass())) {
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type T of com.planner5d.library.utils.room.converter.SerializableRoomTypeConverters");
                return (T) object;
            }
            throw new ClassCastException(object + " can no be cast to " + this.f366636a.getName());
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(objectInputStream, th2);
                throw th3;
            }
        }
    }

    @s2
    @Nullable
    public final byte[] b(@Nullable T t10) throws IOException {
        if (t10 == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        try {
            objectOutputStream.writeObject(t10);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c.a(objectOutputStream, null);
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(objectOutputStream, th2);
                throw th3;
            }
        }
    }
}
