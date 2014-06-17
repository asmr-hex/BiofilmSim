function thepath = getProgramPath(theprog)
% thepath = getProgramPath(theprog)
% returns the path to a few useful programs
%

theprog = lower(theprog);

if ~ispc && ~isunix
    fprintf('Warning: operating system not recognised')
end

if strcmp(theprog,'pov-ray')
	% install location for POV-Ray
	if ispc
		thepath = 'C:\Program Files (x86)\POV-Ray\v3.6\bin\';
	elseif isunix
		thepath = '/Users/Connor/Documents/CMU/Courses/Summer2014/BioNetworks/iDynoMiCS/povray/PovrayCommandLineMacV2';
	end 

elseif strcmp(theprog,'quietpov')
	% install location for the QuietPOV add-on
	if ispc
		thepath = 'C:\Program Files\POV-Ray for Windows v3.6\guiext\QuietPOV';
	elseif isunix
		thepath = '';
	end 

elseif strcmp(theprog,'imagemagick')
	% install location for ImageMagick
	if ispc
		thepath = 'C:\Program Files\ImageMagick-6.6.9-Q16';
	elseif isunix
		thepath = '/Users/Connor/Applications/ImageMagick-6.8.9/bin';
	end

elseif strcmp(theprog,'ffmpeg')
	% install location for the ffmpeg library
	if ispc
		thepath = 'D:\models\eclipse_workspace\idynomics\software_utilities\ffmpeg';
	elseif isunix
		thepath = '/usr/bin/ffmpeg';
	end  

else
	thepath = '';
end

