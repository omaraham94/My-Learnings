import subprocess
while(True):
    try:
        subprocess.call(['./test.sh 100'], shell=True)
    except KeyboardInterrupt:
        print("KeyboardInterrupt has been caught.")
        break
    except:
        print ('i got exception')

print("i errored out")
