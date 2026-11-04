package com.planner5d.android.libtess2;

public class Tessellator {

	static {
		System.loadLibrary("tess2");
	}

	/**
	 * Tessellates polygon
	 *
	 * @param contours CW for polygon, CCW for its holes
	 *
	 * @return triangles
	 */
	public float[] tessellate(float[][] contours) {
		int n = 0;
		for (float[] contour : contours) {
			n += 1 + contour.length;
		}
		float[] data = new float[n];
		n = 0;
		for (float[] contour : contours) {
			data[n++] = contour.length;
			for (float coordinate : contour) {
				data[n++] = coordinate;
			}
		}
		return tessellate(data);
	}

	private native float[] tessellate(float[] data);

}