package retrofit2;

import fj.h;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes14.dex */
class Reflection {

    @e.b(24)
    @zl.a
    static final class Android24 extends Reflection {
        Android24() {
        }

        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @h Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    @zl.a
    static class Java8 extends Reflection {
        Java8() {
        }

        @Override // retrofit2.Reflection
        String describeMethodParameter(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.describeMethodParameter(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @h Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    Reflection() {
    }

    String describeMethodParameter(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    @h
    Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @h Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    boolean isDefaultMethod(Method method) {
        return false;
    }
}
