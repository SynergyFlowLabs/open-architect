package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
public class h extends AppComponentFactory {
    @NonNull
    public Activity a(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public Application b(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public ContentProvider c(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public BroadcastReceiver d(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public Service e(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @NonNull
    public final Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @androidx.annotation.p0 Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
