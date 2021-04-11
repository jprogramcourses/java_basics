package com.juan.javanutshell.bytebuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MainByteBuffer {

	public static void main(String[] args) {
		
		ByteBuffer b = ByteBuffer.allocateDirect(65536);
		ByteBuffer b2 = ByteBuffer.allocate(4096);
		
		byte[] data = {1, 2, 3};
		ByteBuffer b3 = ByteBuffer.wrap(data);
		
		b.order(ByteOrder.BIG_ENDIAN);
		
		int capacity = b.capacity();
		int position = b.position();
		int limit = b.limit();
		int remaining = b.remaining();
		boolean more = b.hasRemaining();

	}

}
