package com.rabbitmq.tools.json;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import org.slf4j.e;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.slf4j.c f266083a = e.k(c.class);

    public static Object a(Object obj, Map<String, Object> map) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
        return b(obj, map, true);
    }

    public static Object b(Object obj, Map<String, Object> map, boolean z10) throws IllegalAccessException, InvocationTargetException, IntrospectionException {
        if (z10) {
            for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(obj.getClass()).getPropertyDescriptors()) {
                String name = propertyDescriptor.getName();
                Method writeMethod = propertyDescriptor.getWriteMethod();
                if (writeMethod != null && !Modifier.isStatic(writeMethod.getModifiers())) {
                    writeMethod.invoke(obj, map.get(name));
                }
            }
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isFinal(modifiers) && !Modifier.isStatic(modifiers)) {
                try {
                    field.set(obj, map.get(field.getName()));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.beans.IntrospectionException */
    public static void c(Object obj, Map<String, Object> map) {
        try {
            a(obj, map);
        } catch (InvocationTargetException e10) {
            f266083a.c("Error in tryFill", e10);
        } catch (IntrospectionException e11) {
            f266083a.c("Error in tryFill", e11);
        } catch (IllegalAccessException e12) {
            f266083a.c("Error in tryFill", e12);
        }
    }
}
