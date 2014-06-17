camera {
	location < 0.0,  1.5,  -1.5 >
	 up < 0.0,  1.0,  0.0 >
	 right < -1.3300000429153442,  0.0,  0.0 >
	 look_at < 0.0,  0.0,  0.0 >
	angle 60.0
}
background {
	color rgb < 1.0,  1.0,  1.0 >
}
light_source {
	  < 1.0,  1.0,  -1.0 >
	color rgb < 1.0,  1.0,  1.0 >
}
light_source {
	  < -1.0,  1.0,  -1.0 >
	color rgb < 1.0,  1.0,  1.0 >
}
union {
box {
	  < 0.0,  0.0,  0.0 >
	  < -0.009999999776482582,  1.0,  1.0 >
	 pigment { color rgb < 0.20000000298023224,  0.20000000298023224,  0.20000000298023224 > }
		finish {
			 phong 0.9
			 phong_size 60
		 metallic }
}
#declare MyAutotrophEPS = color rgb < 1.0 , 1.0 , 0.0 >;
#declare MyHeterotrophEPS = color rgb < 0.0 , 1.0 , 1.0 >;
#declare MyAutotrophs = color rgb < 1.0 , 0.0 , 0.0 >;
#declare MyHeterotroph = color rgb < 0.0 , 0.0 , 1.0 >;
#declare MySwitchHeterotroph_ON = color rgb < 0.0 , 0.0 , 0.0 >;
#declare MySwitchHeterotroph_OFF = color rgb < 1.0 , 1.0 , 1.0 >;
